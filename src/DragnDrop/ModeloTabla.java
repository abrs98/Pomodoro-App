/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DragnDrop;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ModeloTabla extends DefaultTableModel{
    
   
    
    public boolean isCellEdit (int rowIndex, int columnIndex){
        if (columnIndex == 0) {
            return false;
        }
        return false;
    }
    
}
