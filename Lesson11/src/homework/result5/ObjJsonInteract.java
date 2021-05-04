package homework.result5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public final class ObjJsonInteract {
    private ObjJsonInteract() {
    }

    public static void writeObjToJson(File file, Object obj) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(file, obj);
    }

    public static <C> C readObjFormJson(File file, Class<C> objClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, objClass);
    }
}
