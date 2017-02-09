package org.fasttrackit.automation;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;

public class ElementView {

        public WebLocator stopProcessLabel = new WebLocator().setText("Stop the process?", SearchType.TRIM);
        public WebLocator withEnterLabel = new WebLocator().setText("Label with Enter", SearchType.TRIM, SearchType.CHILD_NODE);
        public CheckBox stopProcessCheckbox = new CheckBox(stopProcessLabel);
        public CheckBox  labelWithEntercheckbox = new CheckBox(withEnterLabel);

        public WebLocator autoOption = new WebLocator().setText("Auto").setClasses("filter-option");
        public WebLocator menuDropDown = new WebLocator().setClasses("dropdown-menu");
        public WebLocator manualOption = new WebLocator(menuDropDown).setText("Manual");

        public static void main(String[] args) {
            ElementView test = new ElementView();
            System.out.println(test.stopProcessLabel.getSelector());
            System.out.println(test.withEnterLabel.getSelector());
            System.out.println(test.stopProcessCheckbox.getSelector());
            System.out.println(test.labelWithEntercheckbox.getSelector());
        }

}
