package com.blaiso.excelxml.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

import com.blaiso.excelxml.util.Utils;

public class ExcelFilter extends FileFilter {

    //Accept all directories and all xls, xlsx files.
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Utils.getExtension(f);
        if (extension != null) {
            if (
                extension.equals(Utils.xls) /*||
                extension.equals(Utils.xlsx)*/) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    //The description of this filter
    public String getDescription() {
        return "Classeur Excel 97 - 2003";
    }
}