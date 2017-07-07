package imagetotext;

import java.io.*;
//import java.io.File.*;
import net.sourceforge.tess4j.*;
 
public class tess {
public static void main(String[] args) throws IOException {
File imageFile = new File("S:\\programnming\\workspacee\\imagetotext\\libraries\\try2.png");
ITesseract instance = new Tesseract(); 
 instance.setDatapath("S:\\programnming\\workspacee\\imagetotext\\tessdata");
try {
 
String result = instance.doOCR(imageFile);
System.out.println(result);
 
} catch (TesseractException e) {
System.err.println(e.getMessage());
}
}
}
 
