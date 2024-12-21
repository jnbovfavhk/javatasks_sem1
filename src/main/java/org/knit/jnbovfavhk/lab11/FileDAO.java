package org.knit.jnbovfavhk.lab11;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public interface FileDAO {
    public void saveFile(File file) throws SQLException, IOException;
}
