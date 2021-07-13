package com.spring.professional.exam.tutorial.module01.question02.after;

import com.spring.professional.exam.tutorial.module01.question02.after.TextRenderer.TextRendererBuilder;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.DefaultColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.RedColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.style.DefaultFontStyleRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.BoldFontWeightRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.DefaultFontWeightRenderer;

public class Runner {
	
	public static void main(String... args ) {
		TextRenderer textRenderer = new TextRendererBuilder().build();
		textRenderer.render("Default Rendering");
		
		TextRenderer redreRenderer = new TextRendererBuilder().withFontColorRenderer(new RedColorRenderer())
				.build();
		redreRenderer.render("Red Color Rendering");
		
		TextRenderer boldRenderer = new TextRendererBuilder().withFontweightRenderer(new BoldFontWeightRenderer())
				.build();
		boldRenderer.render("Bold rendering");
	}

}
