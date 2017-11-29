package cn.cerc.jui.phone;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;
import cn.cerc.jui.vcl.ext.UISpan;

public class Block112 extends Component {
    private UISpan left = new UISpan();
    private UISpan right = new UISpan();

    /**
     * 简单显示文字类信息，仅用于显示，不可修改
     * 
     * @param owner
     *            内容显示区
     */
    public Block112(Component owner) {
        super(owner);
        left.setText("(leftText)");
        left.setRole("left");
        right.setText("(rightText)");
        right.setRole("right");
    }

    @Override
    public void output(HtmlWriter html) {
        html.println("<!-- %s -->", this.getClass().getName());
        html.print("<div class='block112' role='row'>");
        left.output(html);
        right.output(html);
        html.println("</div>");
    }

    public UISpan getLeft() {
        return left;
    }

    public UISpan getRight() {
        return right;
    }

    public Block112 setLeftText(String text) {
        left.setText(text);
        return this;
    }

    public Block112 setRightText(String text) {
        right.setText(text);
        return this;
    }

    public Block112 setRightText(String format, Object... args) {
        right.setText(String.format(format, args));
        return this;
    }
}
