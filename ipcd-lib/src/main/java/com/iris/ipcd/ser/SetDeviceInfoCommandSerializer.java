package com.iris.ipcd.ser;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.iris.ipcd.msg.SetDeviceInfoCommand;

public class SetDeviceInfoCommandSerializer implements JsonSerializer<SetDeviceInfoCommand> {

	public JsonElement serialize(SetDeviceInfoCommand cmd, Type typeOfSrc, JsonSerializationContext context) {
		final JsonObject object = new JsonObject();
		object.add("command", context.serialize(cmd.getCommand()));
		if (cmd.getTxnid() != null) object.add("txnid", context.serialize(cmd.getTxnid()));
		
		if (cmd.getValues() != null) object.add("values", context.serialize(cmd.getValues()));
		
		return object;
	}
}
