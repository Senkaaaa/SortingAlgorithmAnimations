package net.bohush.sorting;

import javax.swing.*;

import java.awt.*;

public class Main extends JApplet {

	private static final long serialVersionUID = 1L;
	private SortPanel[] sortPanels = new SortPanel[9];
	private int size = 100;
	private int sleepTime = 1;
	

	public Main() {
		setLayout(new  GridLayout(0, 3, 0, 0));
		int[] list = new int[size];
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
			//list[i] = size - i;
			//list[i] = (size / 4) * (int)(1 + Math.random() * 4);
			//list[i] = (size / 2);
		}
		//list[(int)(Math.random() * size)] = size;
		//shuffle
		for (int i = 0; i < list.length; i++) {
			int index = (int) (Math.random() * list.length);
			int temp = list[i];
			list[i] = list[index];
			list[index] = temp;
		}
		sortPanels[0] = new SelectionSortPanel(" Selection Sort ", list, sleepTime);
		sortPanels[1] = new InsertionSortPanel(" Insertion Sort ", list, sleepTime);
		sortPanels[2] = new BubbleSortPanel(" Bubble Sort ", list, sleepTime);
		sortPanels[3] = new QuickSortPanel(" Quick Sort ", list, sleepTime);
		sortPanels[4] = new MergeSortPanel(" Merge Sort ", list, sleepTime);
		sortPanels[5] = new HeapSortPanel(" Heap Sort ", list, sleepTime);
		sortPanels[6] = new CocktailSortPanel(" Cocktail Sort ", list, sleepTime);
		sortPanels[7] = new CombSortPanel(" Comb Sort ", list, sleepTime);
		sortPanels[8] = new QuickSortPanel(" Quick Sort ", list, sleepTime);
		
		
		for (int i = 0; i < sortPanels.length; i++) {
			add(sortPanels[i]);				
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Sorting Algorithm Animations");
		JApplet applet = new Main();
		frame.add(applet);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}