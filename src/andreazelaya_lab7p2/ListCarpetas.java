package andreazelaya_lab7p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class ListCarpetas implements Serializable{
    private ArrayList<Carpeta> listCarpeta = new ArrayList();
    public File archivo = null;
    
    public ListCarpetas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carpeta> getListCarpeta() {
        return listCarpeta;
    }

    public void setListCarpeta(ArrayList<Carpeta> listCarpeta) {
        this.listCarpeta = listCarpeta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     public void cargarArchivo() {
        try {            
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto  = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        listCarpeta.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
     public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carpeta a : listCarpeta) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
