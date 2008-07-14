package gui;

import javax.swing.table.AbstractTableModel;

import common.Card;
import common.CardsList;

public class TableCardList extends AbstractTableModel { 
	/** auto generated */
	private static final long serialVersionUID = 1L;
	
	String[] columnTitles = { "Id","Name", "Type", "Cost", "Rarity"}; 
	
	public int getColumnCount() { 
		return columnTitles.length;  }
	   
	public String getValueAt(int line, int column) { 
		String val="";
		Card card=CardsList.getCardByOrder(line);
		if (column==indexOfColumn("Id")){val = card.getId();}
		if (column==indexOfColumn("Name")){val = card.getName();}
		if (column==indexOfColumn("Type")){val = card.getType();}
		if (column==indexOfColumn("Cost")){val = card.getCost();}
		if (column==indexOfColumn("Rarity")){val = card.getRarity();}
		return val; }
	   
	public int getRowCount() { 
		return CardsList.length();}
	   
	public String getColumnName(int col){ 
		return columnTitles[col]; } 
	
	
	private int indexOfColumn(String title){
		for (int i = 0; i < columnTitles.length ; i++){
			if (columnTitles[i].equals(title)){return i;}}
		return 0;
	}
	
}
