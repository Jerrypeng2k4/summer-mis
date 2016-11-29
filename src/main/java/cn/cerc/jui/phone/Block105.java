package cn.cerc.jui.phone;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;
import cn.cerc.jpage.vcl.Label;

/**
 * 
 * @author 张弓
 *
 */
public class Block105 extends Component {
	private Label title = new Label();

	/**
	 * 普通的分段标题
	 * 
	 * @param owner
	 *            内容显示区
	 * 
	 */
	public Block105(Component owner) {
		super(owner);
		title.setText("(title)");
	}

	@Override
	public void output(HtmlWriter html) {
		html.println("<!-- %s -->", this.getClass().getName());
		html.print("<div class='block105'>");
		title.output(html);
		html.println("</div>");
	}

	public Label getTitle() {
		return title;
	}
}
