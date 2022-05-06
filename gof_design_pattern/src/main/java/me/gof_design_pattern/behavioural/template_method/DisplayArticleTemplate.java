package me.gof_design_pattern.behavioural.template_method;

public abstract class DisplayArticleTemplate {
	protected Article article;

	public DisplayArticleTemplate(Article article) {
		this.article = article;
	}

	public final void display(){
		title();
		content();
		footer();
	}
	
	protected abstract void title();
	protected abstract void content();
	protected abstract void footer();
}
