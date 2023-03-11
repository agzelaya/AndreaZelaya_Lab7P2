package andreazelaya_lab7p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListArchivos implements Serializable {

    private ArrayList<Archivo> listArchivo = new ArrayList();
    public File archivo = null;

    public ListArchivos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Archivo> getListArchivo() {
        return listArchivo;
    }

    public void setListArchivo(ArrayList<Archivo> listArchivo) {
        this.listArchivo = listArchivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            listArchivo = new ArrayList();
            Archivo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Archivo) objeto.readObject()) != null) {
                        listArchivo.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            } else {
                System.out.println("No existe");
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
            for (Archivo a : listArchivo) {
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
