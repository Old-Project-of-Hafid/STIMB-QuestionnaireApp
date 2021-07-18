package com.stimb.quisioneradmin.ReportGenerator;

/**
 * Created by Yusfia Hafid A on 1/8/2016.
 */

import net.sf.jasperreports.engine.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import net.sf.jasperreports.engine.util.JRProperties;
import org.apache.wicket.injection.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class ReportGenerator implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(ReportGenerator.class);

    @Inject
    Environment environment;

    private JasperPrint jasperPrint = null;
    private String pdfFileName;
    private byte[] filePDF;
    private String defaultFont = "Segoe UI";
    public void PrintPDFSelectedReport(Long id, String filename) {
        HashMap hm = null;
        Injector.get().inject(this);
        String dbUrl = environment.getProperty("spring.datasource.url").toString();
        // String dbUrl = "jdbc:mysql://localhost/test";
        String dbDriver = environment.getProperty("spring.datasource.driver-class-name").toString();
        // String dbDriver = "com.mysql.jdbc.Driver";
        String dbUname = environment.getProperty("spring.datasource.username").toString();
        // String dbUname = "root";
        String dbPwd = environment.getProperty("spring.datasource.password").toString();
        // String dbPwd = "";
        log.info("{} {} {}", dbDriver, dbPwd, dbUname, dbUrl);
        // System.out.println("Usage: ReportGenerator ....");

        try {
            System.out.println("Start ....");
            // Get jasper report

            pdfFileName = filename + ".pdf";
            String jrxmlFileName = "C:/report/ReportQuisioner1.jrxml";
            String jasperFileName = "C:/report/ReportQuisioner1.jasper";

            /*
            DefaultJasperReportsContext context = DefaultJasperReportsContext.getInstance();
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.awt.igno‌​re.missing.font","true");
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.font.name",defaultFont);
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.encoding","Cp1252");
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.embedded","false");
            */

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            // Load the JDBC driver
            Class.forName(dbDriver);
            // Get the connection
            Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbPwd);

            // Create arguments
            // Map params = new HashMap();
            hm = new HashMap();
            hm.put("idKrs", id);
            // Generate jasper print
            jasperPrint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);
            // Export pdf file
            //JasperExportManager.exportReportToPdfFile(jasperPrint, pdfFileName);
            filePDF = JasperExportManager.exportReportToPdf(jasperPrint);
            System.out.println("Done exporting reports to pdf");
        } catch (Exception e) {
            System.out.print("Exceptiion" + e);
        }
    }

    public void PrintPDFSummary(Long id, String filename) {
        HashMap hm = null;
        Injector.get().inject(this);
        String dbUrl = environment.getProperty("spring.datasource.url").toString();
        // String dbUrl = "jdbc:mysql://localhost/test";
        String dbDriver = environment.getProperty("spring.datasource.driver-class-name").toString();
        // String dbDriver = "com.mysql.jdbc.Driver";
        String dbUname = environment.getProperty("spring.datasource.username").toString();
        // String dbUname = "root";
        String dbPwd = environment.getProperty("spring.datasource.password").toString();
        // String dbPwd = "";
        log.info("{} {} {}", dbDriver, dbPwd, dbUname, dbUrl);
        // System.out.println("Usage: ReportGenerator ....");

        try {
            System.out.println("Start ....");
            // Get jasper report

            pdfFileName = filename + ".pdf";
            String jrxmlFileName = "C:/report/ReportQuisioner2.jrxml";
            String jasperFileName = "C:/report/ReportQuisioner2.jasper";

            /*
            DefaultJasperReportsContext context = DefaultJasperReportsContext.getInstance();
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.awt.igno‌​re.missing.font","true");
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.font.name",defaultFont);
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.encoding","Cp1252");
            JRPropertiesUtil.getInstance(context).setProperty("net.sf.jasperreports.default.pdf.embedded","false");
            */

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            // Load the JDBC driver
            Class.forName(dbDriver);
            // Get the connection
            Connection conn = DriverManager.getConnection(dbUrl, dbUname, dbPwd);

            // Create arguments
            // Map params = new HashMap();
            hm = new HashMap();
            hm.put("idKelas", id);
            // Generate jasper print
            jasperPrint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);
            // Export pdf file
            //JasperExportManager.exportReportToPdfFile(jasperPrint, pdfFileName);
            filePDF = JasperExportManager.exportReportToPdf(jasperPrint);
            System.out.println("Done exporting reports to pdf");
        } catch (Exception e) {
            System.out.print("Exceptiion" + e);
        }
    }

    public JasperPrint getJasperPrint() {
        return jasperPrint;
    }

    public void setJasperPrint(JasperPrint jasperPrint) {
        this.jasperPrint = jasperPrint;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public byte[] getFilePDF() {
        return filePDF;
    }

    public void setFilePDF(byte[] filePDF) {
        this.filePDF = filePDF;
    }

    public File getFile() throws IOException {
        File file = new File(getPdfFileName());
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(filePDF);
        fos.close();
        return file;
    }
}