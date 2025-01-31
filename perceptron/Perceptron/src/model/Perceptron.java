package model;

import java.util.ArrayList;
import java.util.Random;

public class Perceptron {

	private Double eta;
	private Integer epochs;
	private ArrayList<ArrayList<Double>> x;
	private ArrayList<Double> y;
	private ArrayList<Double> yhat;
	private ArrayList<ArrayList<Double>> w = new ArrayList<ArrayList<Double>>();

	public Perceptron() {

	}

	public Perceptron(Double eta, Integer epochs, ArrayList<ArrayList<Double>> x, ArrayList<Double> y) {
		super();
		this.eta = eta;
		this.epochs = epochs;
		this.x = x;
		this.y = y;
	}

	public ArrayList<Double> getYhat() {
		return yhat;
	}

	public void setYhat(ArrayList<Double> yhat) {
		this.yhat = yhat;
	}

	public ArrayList<ArrayList<Double>> getW() {
		return w;
	}

	public void setW(ArrayList<ArrayList<Double>> w) {
		this.w = w;
	}

	private static double sigmoid(double x) {
		return 1 / (1 + Math.exp(-x));
	}

	private static ArrayList<Double> randomWeights(int n) {

		ArrayList<Double> arrayRandom = new ArrayList<Double>(n);

		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			double r = rand.nextDouble();
			arrayRandom.add(r);

		}

		return arrayRandom;

	}

	public ArrayList<Double> sumProduct(ArrayList<ArrayList<Double>> x) {

		ArrayList<Double> value = new ArrayList<Double>();

		for (int i = 0; i < x.size(); i++) {
			double sum = 0;
			for (int j = 0; j < x.get(0).size(); j++) {
				sum += getW().get(i).get(j) * getW().get(i).get(j);
			}
			value.add(sum);
		}

		return value;
	}

	public void yhatCalc(ArrayList<ArrayList<Double>> x, ArrayList<Double> y) {

		ArrayList<Double> sp = sumProduct(x);

		ArrayList<Double> y_hat = new ArrayList<Double>();
		for (int i = 0; i < getW().size(); i++) {
			y_hat.add(sigmoid(sp.get(i)));
		}

		this.setYhat(y_hat);

	}

	public ArrayList<ArrayList<Double>> adjustWeights() {
		
		ArrayList<Double> diff = new ArrayList<Double>();
		ArrayList<ArrayList<Double>> adjustedW = new ArrayList<ArrayList<Double>>();
		
		for (int i = 0; i < yhat.size(); i++) {
			diff.add(y.get(i)-yhat.get(i));
		}
		
		for (int i = 0; i < w.size(); i++) {
			
			ArrayList<Double> sum = new ArrayList<Double>();
			
			for (int j = 0; j < w.get(0).size(); j++) {
					double aux = w.get(i).get(j)+eta*diff.get(i)*x.get(i).get(j);
					sum.add(aux);
			}
			adjustedW.add(sum);
		}
		
		this.setW(adjustedW);
		
		return adjustedW;
		
	}
	
	public ArrayList<ArrayList<Double>> train(ArrayList<ArrayList<Double>> x, ArrayList<Double> y){
		
		ArrayList<ArrayList<Double>> finalW = new ArrayList<ArrayList<Double>>();
		
		for (int i = 0; i < x.size(); i++) {
			ArrayList<Double> wi = randomWeights(x.get(0).size());
			w.add(wi);
		}
		
		for (int ep = 0; ep<epochs; ep++) {
			this.yhatCalc(x, y);
			this.adjustWeights();
			System.out.println("Epoch: ------------------------------------------------ " + ep);
			
		}
		
		finalW = getW();
		
		return finalW;
	}
	
	public ArrayList<Double> predict(double thr, ArrayList<ArrayList<Double>> x_test, ArrayList<Double> y_test){
		
		ArrayList<Double> sp = sumProduct(x_test);

		ArrayList<Double> y_hat_new = new ArrayList<Double>();
		
		for (int i = 0; i < sp.size(); i++) {
			if (sigmoid(sp.get(i))>=thr) {
				y_hat_new.add(1.0);
			}
			else {
				y_hat_new.add(0.0);
			}
			
		}
		
		return y_hat_new;
	}
	
	public double accuracy(ArrayList<Double> y_pred, ArrayList<Double> y_true) {
		
		int aux = 0;
		
		for (int i = 0; i <y_true.size(); i++) {
			if(y_true.get(i)-y_pred.get(i)==0) {
				aux ++;
			}
		} 
		
		return aux/(double) y_true.size();
	}

}
