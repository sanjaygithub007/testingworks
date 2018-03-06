package datadrivenframework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class AddNumExcel
{
	public static void main(String[] args) throws IOException 
	{
		//Open existing file
		File f=new File("adddata.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		
		//Open same excel file for result writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(1);
		
		//Perform Addition
		for(int i=1;i<nour;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0, i).getContents());
			int y=Integer.parseInt(rsh.getCell(0,i).getContents());
			int z=x+y;
			Number n=new Number(0,i,z);
			wsh.addCell(n);
			
			// save excel sheet and close it
			wwb.write();
			wwb.close();
			rwb.close();
		}
		
	}
}
	
