package me.gof_design_pattern.behavioural.chainResponsibility;

public class ProtocolHandler extends Handler {
	@Override
	protected void process(String url) {
		int index = url.indexOf("://");
		if (index != -1) {
			System.out.println("PROTOCOL: " + url.substring(0, index));
		} else {
			System.out.println("NO PROTOCOL");
		}
	}
}
