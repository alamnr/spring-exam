package com.spring.professional.exam.tutorial.module01.question02.after;

import com.spring.professional.exam.tutorial.module01.question02.common.renderer.Renderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.DefaultColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.color.FontColorRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.style.DefaultFontStyleRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.style.FontStyleRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.DefaultFontWeightRenderer;
import com.spring.professional.exam.tutorial.module01.question02.common.renderer.weight.FontWeightRenderer;

public class TextRenderer {
	
	private final FontStyleRenderer fontStyleRenderer;
	private final FontColorRenderer fontColorRenderer;
	private final FontWeightRenderer fontWeightRenderer;
	
	private TextRenderer(FontStyleRenderer fontStyleRenderer, FontColorRenderer fontColorRenderer, FontWeightRenderer fontWeightRenderer) {
		this.fontStyleRenderer = fontStyleRenderer;
		this.fontColorRenderer = fontColorRenderer;
		this.fontWeightRenderer = fontWeightRenderer;
	}
	
	public void render(String text) {
		String renderedText = applyRendering(text, fontStyleRenderer,fontColorRenderer,fontWeightRenderer);
		System.out.println(renderedText);
	}
	
	private String applyRendering(String text, Renderer... renderers) {
		for(Renderer renderer : renderers) {
			text = renderer.render(text);
		}
		return text;
	}
	
	public static class TextRendererBuilder {
		private FontStyleRenderer fontStyleRenderer = new DefaultFontStyleRenderer();
		private FontColorRenderer fontColorRenderer = new DefaultColorRenderer();
		private FontWeightRenderer fontWeightRenderer = new DefaultFontWeightRenderer();
		
		public TextRendererBuilder withFontStyleRendere(FontStyleRenderer fontStyleRenderer) {
			this.fontStyleRenderer = fontStyleRenderer;
			return this;
		}
		
		public TextRendererBuilder withFontColorRenderer(FontColorRenderer fontColorRenderer) {
			this.fontColorRenderer = fontColorRenderer;
			return this;
		}
		
		public TextRendererBuilder withFontweightRenderer(FontWeightRenderer fontWeightRenderer) {
			this.fontWeightRenderer = fontWeightRenderer;
			return this;
		}
		
		public TextRenderer build() {
			return new TextRenderer(fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
		}
	}

}
