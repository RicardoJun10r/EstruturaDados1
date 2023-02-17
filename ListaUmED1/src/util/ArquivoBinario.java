package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArquivoBinario {
    
    public ArquivoBinario(){}

    public void save(List<Object> objetos, String path) throws IOException {
        File file = new File(path);
        file.delete();
        file.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
        objOutput.writeObject(objetos);
        objOutput.close();
    }

    @SuppressWarnings("unchecked")
    public List<Object> load(String path) throws IOException, ClassNotFoundException {
        List<Object> lista = new ArrayList<>();

        File file = new File(path);

        if(file.exists())
        {
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
            lista = (ArrayList<Object>) objInput.readObject();
            objInput.close();
        }
        return lista;
    }
}
