package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArquivoBinario {
    
    private final String PATH = "../temp/pessoas.dat";

    public void save(List<Object> objetos)
    {
        try {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(this.PATH));
            for(Object i : objetos)
            {
                file.writeObject(i);
            }
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Object> load()
    {
        List<Object> objetos = new ArrayList<>();
        try {
            Object i = null;
            ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.PATH));
            do {
                i = (Object) file.readObject();
                if(i != null)
                {
                    objetos.add(i);
                }
            } while (i != null);
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        return objetos;
    }
}
