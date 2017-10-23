package test.fw.validation.groups;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({Group1.class, Group2.class, Default.class})
public interface Order {

}
