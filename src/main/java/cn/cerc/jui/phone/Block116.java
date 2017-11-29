package cn.cerc.jui.phone;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;
import cn.cerc.jui.vcl.UIButton;
import cn.cerc.jui.vcl.UIImage;
import cn.cerc.jui.vcl.ext.UISpan;

/**
 * @author 善贵
 *
 */
public class Block116 extends Component {
    private UISpan title = new UISpan();
    private UIImage image = new UIImage();
    private UIButton button = new UIButton();

    /**
     * 分段标题，带一个图标及按钮
     * 
     * @param owner
     *            内容显示区
     */
    public Block116(Component owner) {
        super(owner);
        title.setText("(title)");
        image.setRole("image");
        image.setSrc("jui/phone/block401_003.png");
        button.setText("(button)");
    }

    @Override
    public void output(HtmlWriter html) {
        html.println("<!-- %s -->", this.getClass().getName());
        html.print("<div class='block116'>");
        image.output(html);
        title.output(html);
        button.output(html);
        html.println("</div>");
    }

    public UISpan getTitle() {
        return title;
    }

    public UIImage getImage() {
        return image;
    }

    public UIButton getButton() {
        return button;
    }
}
