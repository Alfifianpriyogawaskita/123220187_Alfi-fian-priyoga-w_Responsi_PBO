/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class modelHewan extends AbstractTableModel{
    List<datahewan> dh;
    public modelHewan(List<datahewan>dh){
        this.dh = dh;
    }

    @Override
    public int getRowCount() {
        return dh.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 3:
                return "Kelas";
            case 4:
                return "Jenis Makanan";  
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dh.get(row).getId;
            case 1:
                return dh.get(row).getnama;
            case 2:
                return dh.get(row).getkelas;
            case 3:
                return dh.get(row).getjenismakanan;
            default:
                return null;
                
        }
    }
}
