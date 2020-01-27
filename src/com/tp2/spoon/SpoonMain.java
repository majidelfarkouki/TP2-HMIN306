package com.tp2.spoon;

import java.io.IOException;

public class SpoonMain
{
	public static void main(String[] Args) throws IOException
	{		
	
SpoonInstance<Void> spoonInstance = new SpoonInstance<Void>("./src/com/tp2/spoon/originalcode/Motorcycle.java", "com.tp2.spoon.originalcode.Motorcycle");
		
		spoonInstance.addField("color", String.class);
		
		spoonInstance.addMethod("startEngine", "System.out.println(\"The engine is now on.\")");

		spoonInstance.createFile("./src/com/tp2/spoon/transformedcode/Motorcycle.java", "com.tp2.spoon.transformedcode");
	
	}
}
