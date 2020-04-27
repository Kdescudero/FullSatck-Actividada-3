package com.Actvidad_2.Actividad_2.time.serialization;

import com.Actvidad_2.Actividad_2.time.domain.Seconds;
import com.google.gson.*;

import java.lang.reflect.Type;

public class adacterSeconds implements JsonSerializer<Seconds>, JsonDeserializer<Seconds> {
    @Override
    public Seconds deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Seconds.of(value);
    }

    @Override
    public JsonElement serialize(Seconds seconds, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = seconds.getValue();
        return new JsonPrimitive(value);
    }
}
