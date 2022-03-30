import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscritaExcel extends CalculoMedia implements Escrita {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileOutputStream fileOut;
	
	public EscritaExcel(String nomeArquivo, int qtdeNumeros) throws FileNotFoundException {
		super(qtdeNumeros);
		fileOut = new FileOutputStream(nomeArquivo + ".xlsx");
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Planilha1");
	}

	public void escreverNumero(int numero) {
		XSSFRow row = sheet.createRow(super.getIndice());
		XSSFCell cell = row.createCell(0);
		cell.setCellValue(numero);
		super.registra(numero);
	}

	public void escreverMedia() throws IOException {		
		XSSFRow row = sheet.createRow(super.getIndice());
		XSSFCell cell = row.createCell(0);
		cell.setCellValue(super.calculaMedia());
		
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	public int getIndice() {
		return super.getIndice();
	}
}
