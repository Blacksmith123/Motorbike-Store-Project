package HoaDonPDF;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.itextpdf.awt.geom.Line2D.Double;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class InHoaDon {
	private PdfPTable tblOrderInfo = new PdfPTable(4);
	private PdfPTable tblOrderDetail = new PdfPTable(4);
	private PdfPTable tblPurchaseInfo = new PdfPTable(2);

	public InHoaDon() {

	}

	public void printOrder(String orderID) {
		String FILE = "D:\\Study\\Download\\InHoaDon\\" + orderID + ".pdf";

		try {
			Document doc = new Document(PageSize.A4);
			PdfWriter.getInstance(doc, new FileOutputStream(FILE));
			doc.open();
			addHeader(doc);
			doc.add(tblOrderInfo);
			doc.add(addHeaderOrderDetail());
			doc.add(tblOrderDetail);
			doc.add(tblPurchaseInfo);
			addFooter(doc);
			doc.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void addHeader(Document doc) throws DocumentException {
		// TODO Auto-generated method stub
		Paragraph pNameStore = new Paragraph("CUA HANG XE MAY", FontFactory.getFont("arial", 25, Font.BOLD));

		pNameStore.setAlignment(Element.ALIGN_CENTER);
		doc.add(pNameStore);

		addEmptyLine(doc, 1);

		Paragraph pAddress = new Paragraph("222/34 Thao Dien, TP Ho Chi Minh");
		pAddress.setAlignment(Element.ALIGN_CENTER);
		doc.add(pAddress);

		Paragraph pTitle = new Paragraph("HOA DON BAN HANG");
		pTitle.setAlignment(Element.ALIGN_CENTER);
		doc.add(pTitle);

		addEmptyLine(doc, 1);
	}

	public PdfPTable addOrderInfo(String ngayTaoHoaDon, String maHoaDon, String maNhanVien) throws DocumentException {
		// TODO Auto-generated method stub

		PdfPCell cellNgayBan = new PdfPCell();
		addCellBorderAlign(cellNgayBan, "Ngay Ban", "l");
		tblOrderInfo.addCell(cellNgayBan);

		PdfPCell cellNgayBanContent = new PdfPCell();
		addCellBorderAlign(cellNgayBanContent, ngayTaoHoaDon, "r");
		tblOrderInfo.addCell(cellNgayBanContent);

		PdfPCell cellNhanVien = new PdfPCell();
		addCellBorderAlign(cellNhanVien, "Nhan Vien", "l");
		tblOrderInfo.addCell(cellNhanVien);

		PdfPCell cellNhanVienContent = new PdfPCell();

		addCellBorderAlign(cellNhanVienContent, maNhanVien, "r");
		tblOrderInfo.addCell(cellNhanVienContent);

		PdfPCell cellHoaDon = new PdfPCell();
		addCellBorderAlign(cellHoaDon, "Hoa Don", "l");
		tblOrderInfo.addCell(cellHoaDon);

		PdfPCell cellHoaDonContent = new PdfPCell();
		cellHoaDonContent.setColspan(3);
		addCellBorderAlign(cellHoaDonContent, maHoaDon, "l");
		tblOrderInfo.addCell(cellHoaDonContent);

//		addCellNull(tblOrderInfo);
//		addCellNull(tblOrderInfo);

		return tblOrderInfo;
	}

	private PdfPTable addHeaderOrderDetail() throws DocumentException {
		// TODO Auto-generated method stub
		PdfPTable tbl = new PdfPTable(4);

		PdfPCell cellHoaDon = new PdfPCell();
		addCellBorderAlign(cellHoaDon, "San Pham", "l");
		tbl.addCell(cellHoaDon);

		PdfPCell cellHoaDonContent = new PdfPCell();
		addCellBorderAlign(cellHoaDonContent, "So Luong", "r");
		tbl.addCell(cellHoaDonContent);

		PdfPCell cellNhanVien = new PdfPCell();
		addCellBorderAlign(cellNhanVien, "Don Gia", "r");
		tbl.addCell(cellNhanVien);

		PdfPCell cellNhanVienContent = new PdfPCell();
		addCellBorderAlign(cellNhanVienContent, "Thanh Tien", "r");
		tbl.addCell(cellNhanVienContent);

		PdfPCell cellNull = new PdfPCell();
		cellNull.setColspan(4);
		addCellBorderAlign(cellNull, "===========================================================", "l");

		tbl.addCell(cellNull);

		return tbl;
	}

	public PdfPTable addCellOrderDetail(String ten, String ma, String soLuong, String donGia, String thanhTien) {
		// TODO Auto-generated method stub
		PdfPCell cellTenSP = new PdfPCell();
		cellTenSP.setColspan(4);
		addCellBorderAlign(cellTenSP, ten + " ", "l");
		tblOrderDetail.addCell(cellTenSP);

		PdfPCell cellMaSP = new PdfPCell();
		addCellBorderAlign(cellMaSP, ma + " ", "l");
		tblOrderDetail.addCell(cellMaSP);

		PdfPCell cellSoLuongSP = new PdfPCell();
		addCellBorderAlign(cellSoLuongSP, soLuong + " ", "r");
		tblOrderDetail.addCell(cellSoLuongSP);

		PdfPCell cellDonGiaSP = new PdfPCell();
		addCellBorderAlign(cellDonGiaSP, donGia + " ", "r");
		tblOrderDetail.addCell(cellDonGiaSP);

		PdfPCell cellThanhTienSP = new PdfPCell();
		addCellBorderAlign(cellThanhTienSP, thanhTien + " ", "r");
		tblOrderDetail.addCell(cellThanhTienSP);

		PdfPCell cellNull = new PdfPCell();

		cellNull.setColspan(4);

		tblOrderDetail.addCell(cellNull);
		addCellBorderAlign(cellNull, "-----------------------------------------------------------", "l");
		return tblOrderDetail;
	}

	public PdfPTable addPurchaseInfo(String tongTien) throws DocumentException {
		// TODO Auto-generated method stub

		// Row Total

		// Row Discount

		// Row Payment
//		DecimalFormat df = new DecimalFormat("#,###.VND");

//		PdfPCell cellThueVAT = new PdfPCell();
//		addCellBorderAlign(cellThueVAT, "Thue VAT", "l");
//		tblPurchaseInfo.addCell(cellThueVAT);
//
//		PdfPCell cellThueVATContent = new PdfPCell();
//		addCellBorderAlign(cellThueVATContent, df.format(java.lang.Double.parseDouble(thueVAT)) + " ", "r");
//		tblPurchaseInfo.addCell(cellThueVATContent);

		PdfPCell cellTienPhaiThanhToan = new PdfPCell();
		addCellBorderAlign(cellTienPhaiThanhToan, "Tong Tien", "l");
		tblPurchaseInfo.addCell(cellTienPhaiThanhToan);
		NumberFormat format = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
		double number = java.lang.Double.parseDouble(tongTien);

		PdfPCell cellTienPhaiThanhToanContent = new PdfPCell();
		addCellBorderAlign(cellTienPhaiThanhToanContent, format.format(number) + "VND", "r");
		cellTienPhaiThanhToanContent.setBorderWidthTop(0);
		tblPurchaseInfo.addCell(cellTienPhaiThanhToanContent);

		// Row Recieve

//		
//		PdfPCell cellTienNhan = new PdfPCell();
//		addCellBorderAlign(cellTienNhan, "Tien Nhan", "l");
//		tblPurchaseInfo.addCell(cellTienNhan);
//
//		PdfPCell cellTienNhanContent = new PdfPCell();
//		addCellBorderAlign(cellTienNhanContent,  df.format(java.lang.Double.parseDouble(tienNhan)) + " ", "r");
//		tblPurchaseInfo.addCell(cellTienNhanContent);

		// Row Change
//		PdfPCell cellTienTra = new PdfPCell();
//		addCellBorderAlign(cellTienTra, "Tien Thua", "l");
//		tblPurchaseInfo.addCell(cellTienTra);
//
//		PdfPCell cellTienTraContent = new PdfPCell();
//		addCellBorderAlign(cellTienTraContent,  df.format(java.lang.Double.parseDouble(tienThua)) + " ", "r");
//		tblPurchaseInfo.addCell(cellTienTraContent);

		PdfPCell cellNotice = new PdfPCell();
		cellNotice.setColspan(2);
		addCellBorderAlign(cellNotice, "===========================================================", "l");
//		addCellBorderAlign(cellNotice, "(Gia Da Bao Gom Thue VAT)", "c");
		tblPurchaseInfo.addCell(cellNotice);

		return tblPurchaseInfo;
	}

	private void addFooter(Document doc) throws DocumentException {
		// TODO Auto-generated method stub
		addEmptyLine(doc, 2);

		Paragraph pCamOn = new Paragraph("CAM ON QUY KHACH VA HEN GAP LAI");
		pCamOn.setAlignment(Element.ALIGN_CENTER);
		doc.add(pCamOn);

		Paragraph pLienHe = new Paragraph("Hotline: 0374858273");
		pLienHe.setAlignment(Element.ALIGN_CENTER);
		doc.add(pLienHe);
	}

	private void addEmptyLine(Document doc, int line) throws DocumentException {
		// TODO Auto-generated method stub
		for (int i = 0; i < line; i++) {
			doc.add(new Paragraph(" "));
		}
	}

	private void addCellNull(PdfPTable table) {
		// TODO Auto-generated method stub
		PdfPCell cellNull = new PdfPCell();
		cellNull.setBorder(0);
		table.addCell(cellNull);
	}

	private PdfPCell addCellBorderAlign(PdfPCell cell, String content, String align) {
		// TODO Auto-generated method stub
		Paragraph p = new Paragraph(content + "");
		cell.setBorder(0);
		if (align.equalsIgnoreCase("r")) {
			p.setAlignment(Element.ALIGN_RIGHT);
			cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
		} else if (align.equalsIgnoreCase("l")) {
			p.setAlignment(Element.ALIGN_LEFT);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		} else if (align.equalsIgnoreCase("c")) {
			p.setAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		}
		cell.addElement(p);

		return cell;
	}

}