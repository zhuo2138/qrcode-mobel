import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.attitude.util.CodeCreator;
import com.attitude.util.CodeDecoder;
import com.attitude.util.CodeModel;

/**
 * @author zxm
 *
 */
public class QRCodeMain{
    private static void encode() {
        CodeCreator creator = new CodeCreator();
        CodeModel info = new CodeModel();
        info.setWidth(400);
        info.setHeight(400);
        info.setFontSize(24);
        info.setContents("万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新\n万水千山只等闲\n小荷才楼尖尖角\n谁家新燕啄春泥\n无边光景一时新");
        info.setLogoFile(new File("D:/workspaces/workspace1/tong3/WebContent/img/girl3.jpg"));
        info.setDesc("你怎么会知道我的苦，我是一页孤舟，漂流在尘世中");
        //info.setLogoDesc("一叶浮萍归大海，adsasfbhtjg人生何处不相逢");  
        //info.setLogoDesc("一叶浮萍");  
        creator.createCodeImage(info, "D:/2Dcode/dest." + info.getFormat());
    }

    static public void decode(InputStream input){
        CodeDecoder decoder = new CodeDecoder();
        String result = decoder.decode(input);
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception{
        encode();
        //decode(new FileInputStream(new File("D:/2Dcode/dest.gif")));  
    }
}  