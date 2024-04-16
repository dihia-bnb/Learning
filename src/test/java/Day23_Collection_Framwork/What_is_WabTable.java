package Day23_Collection_Framwork;

public class What_is_WabTable {

	// It is dynamic table which represents data in from of rows and cols
	// Criteria to work with WabTables - Very good Xpath Knowledge or cssSelector
	// knowledge
	// most of the time the html tag for a webTable will be table
	// The table has a class attribute known as DataTable
	// The table has a head and a body
	// The head is represented by thead
	// Here in this example the head has 1 row which is represented by the html tag
	// tr
	// the row has cols few cols and these cols are represented by the html tag th
	// The body is represented by tbody
	// the rows are represented by tr
	// the cols are represented by td

	// Xpath whole table
	// table[@class='dataTable']

	// Xpath thead
	// table[@class='dataTable']/thead

	// Xpath of row of header
	// table[@class='dataTable']/thead/tr
	// all cols
	// table[@class='dataTable']/thead/tr/th
	// specific col
	// table[@class='dataTable']/thead/tr/th[5]

	// Xpath tbody
	// table[@class='dataTable']/tbody
    //all rows 
	//table[@class='dataTable']/tbody/tr
	//spesial row
	//table[@class='dataTable']/tbody/tr[1]
	//all cols of the body
	//table[@class='dataTable']/tbody/tr/td
	//first cols first rows
	//table[@class='dataTable']/tbody/tr[1/td[1]
	//table[@class='dataTable']/tbody/tr[9]/td[4]
	//all row value in first col
	//table[@class='dataTable']/tbody/tr/td[1]
	//all row in 4 col
	//table[@class='dataTable']/tbody/tr/td[4]
	
	
	
	
	
	
	
	
	
	
	
}
