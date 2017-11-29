package cn.cerc.jui.phone;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;
import cn.cerc.jui.vcl.ext.UISpan;

/**
 * 提示块
 * 
 * @author 郭向军
 *
 */
public class Block124 extends Component {
    private UISpan title = new UISpan();

    public Block124(Component owner) {
        super(owner);
        title.setText("提示:");
    }

    @Override
    public void output(HtmlWriter html) {
        html.println("<!-- %s -->", this.getClass().getName());
        html.print("<div class='block124'>");
        this.title.output(html);
        html.print("</div>");
    }

    public UISpan getTitle() {
        return title;
    }

}
