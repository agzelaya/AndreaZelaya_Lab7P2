package andreazelaya_lab7p2;

public class Archivo {
    private String nombre;
    private String link;
    private String extension;
    private double size;

    public Archivo(String nombre, String link, String extension, double size) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.size = size;
    }

    public Archivo() {
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
