package com.Actvidad_2.Actividad_2.time.serialization;

import com.Actvidad_2.Actividad_2.time.domain.Minutes;
import com.google.gson.*;

import java.lang.reflect.Type;

public class adacterMinutes implements JsonSerializer<Minutes>, JsonDeserializer<Minutes> {

    @Override
    public Minutes deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Minutes.of(value);
    }

    @Override
    public JsonElement serialize(Minutes minutes, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = minutes.getValue();
        return new JsonPrimitive(value);
    }
}
