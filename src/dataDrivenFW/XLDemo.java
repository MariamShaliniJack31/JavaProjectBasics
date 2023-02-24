package dataDrivenFW;

public class XLDemo {

	//Run the Class as Java Application
	public static void main(String[] args) throws Exception {

		String Path = "C:\\Users\\mrufu\\OneDrive\\Desktop\\DataDrivenXL.xlsx";
		ExcelUtils dd = new ExcelUtils (Path,"Sheet3");
		System.out.println("The Row count is " + dd.excel_get_rows());
	    dd.getCellDataasnumber(0,0);
	    dd.getCellDataasstring(0,1);
	    dd.getCellDataasnumber(0,2);
	    dd.getCellDataasnumber(1,0);
	    dd.getCellDataasstring(1,1);
	    dd.getCellDataasnumber(1,2);
	    dd.getCellDataasnumber(2,0);
	    dd.getCellDataasstring(2,1);
	    dd.getCellDataasnumber(2,2);
	    
	    dd.setcellData(Path, "TC Passed", 6, 6);
	    dd.setcellData(Path, "TC Passed", 7, 6);
	    dd.setcellData(Path, "TC Passed", 8, 6);
	    dd.setcellData(Path, "TC Passed", 9, 6);
	    dd.setcellData(Path, "TC Passed", 10, 6);
	    dd.setcellData(Path, "TC Passed", 11, 6);
	    dd.setcellData(Path, "TC Passed", 12, 6);
	}
}
