package com.stimb.quisioneradmin.OtherService;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by Yusfia Hafid A on 12/31/2015.
 */
@Service
public class ImageService {
    public static byte[] getImage(boolean check){
        String sources = "check_box.png";
        String sourcesfalse = "box.png";
        if (check){
            final File imageFile = new File(sources);
            Mat input = Highgui.imread(imageFile.getPath(), Highgui.CV_LOAD_IMAGE_GRAYSCALE);
            MatOfByte result = new MatOfByte();
            Highgui.imencode(".png", input, result);
            byte[] image = result.toArray();
            return image;
        }else{
            final File imageFile = new File(sourcesfalse);
            Mat input = Highgui.imread(imageFile.getPath(), Highgui.CV_LOAD_IMAGE_GRAYSCALE);
            MatOfByte result = new MatOfByte();
            Highgui.imencode(".png", input, result);
            byte[] image = result.toArray();
            return image;
        }
    }
    public static String getImageLocation(boolean check){
        String sources = "check_box.png";
        String sourcesfalse = "box.png";
        if (check){
            return sources;
        }else{
            return sourcesfalse;
        }
    }

    public static String getHtmlIcon(boolean check){
        if (check){
            return "<div style=\"text-align: center\">&#9745</div>";
        }else{
            return "<div style=\"text-align: center\">&#9744</div>";
        }
    }
}
