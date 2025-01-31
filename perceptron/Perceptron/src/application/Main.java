package application;

import java.util.ArrayList;

import data.Data;
import model.Perceptron;

public class Main {

	public static void main(String[] args) {
		
		// Getting data
		String path = "C:\\Users\\Windows 11\\Desktop\\Projetos\\Java_2025\\data\\titanic.csv";
		Data dataset = new Data(path);
		String[][] data = dataset.getData();
		ArrayList<ArrayList<Double>> x = new ArrayList<ArrayList<Double>>();
		ArrayList<Double> y = new ArrayList<Double>();
		
		//Creating x and y
		for (int i = 1; i<data.length; i++) {
			ArrayList<Double> xaux = new ArrayList<Double>();
			try {
				xaux.add(Double.valueOf(data[i][5]));
				xaux.add(Double.valueOf(data[i][9]));
				xaux.add(Double.valueOf(data[i][2]));
			}catch (Exception e){
				xaux.add(0.0);
				xaux.add(0.0);
				xaux.add(0.0);
			}
			finally {
				x.add(xaux);
			}
			
			y.add(Double.valueOf(data[i][1]));
		}
		
		// Divide in train and test datasets
		
		double perc = 0.8;
		int N = (int) data.length;
		int n_start = (int) Math.floor(perc*N); 
		
		ArrayList<ArrayList<Double>> x_train = new ArrayList<ArrayList<Double>>(x.subList(0, n_start));
		ArrayList<ArrayList<Double>> x_test = new ArrayList<ArrayList<Double>>(x.subList(n_start, N-1));
		ArrayList<Double> y_train = new ArrayList<Double>(y.subList(0, n_start));
		ArrayList<Double> y_test = new ArrayList<Double>(y.subList(n_start, N-1));
		
		
		// Modeling
		
		Perceptron model = new Perceptron(0.0001, 100000, x_train, y_train);
		
        model.train(x_train,y_train);
		
		
		// Evaluate
        ArrayList<Double> y_pred = model.predict(0.98, x_test, y_test);
        double acc = model.accuracy(y_pred, y_test);
        
		
		System.out.println("Size:"+ y_test.size()+" / answers:" + y_test);
		System.out.println("Size:"+ y_pred.size()+" / answers:" + y_pred);
		System.out.println(acc);

	}

}
