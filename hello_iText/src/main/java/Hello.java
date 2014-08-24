import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by chenlian on 14-8-24.
 */
public class Hello {

    /**
     * 生成PDF文档
     * @param filePath 文档输出的路径包含后缀
     */
    public void outputFile(String filePath) {
//        建立文档，设置文档纸张大小
        Document document = new Document(PageSize.A4);
        try {
//            写入文件
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
//            打开文件
            document.open();
//            向文档内，添加内容
            document.add(new Paragraph("Hello ITextPdf"));
//            关闭文档
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
