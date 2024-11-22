package cpp_lib_plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class OpenHtmlAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        try {
            // Получаем поток ресурса
            InputStream resourceStream = getClass().getClassLoader().getResourceAsStream("html/Untitled-2.html");
            if (resourceStream == null) {
                System.err.println("HTML файл не найден.");
                return;
            }

            // Сохраняем ресурс во временный файл
            File tempFile = File.createTempFile("html_temp", ".html");
            tempFile.deleteOnExit();

            try (FileOutputStream out = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = resourceStream.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }

            // Открытие временного файла в браузере
            Desktop.getDesktop().browse(tempFile.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}