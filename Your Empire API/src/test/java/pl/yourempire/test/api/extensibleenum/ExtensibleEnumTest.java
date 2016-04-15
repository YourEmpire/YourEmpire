package pl.yourempire.test.api.extensibleenum;

import org.junit.Assert;
import org.junit.Test;
import pl.yourempire.api.extensibleenum.ExtensibleEnum;

public class ExtensibleEnumTest
{
    private ExtensibleEnum<Foo> extEnum = new ExtensibleEnum<>();
    private Foo string = new Foo("My String");

    @Test
    public void addTest()
    {
        extEnum.addConstant("FOO_NULL_STRING", new Foo(null));
        extEnum.addConstant("FOO_EMPTY_STRING", new Foo(""));
        extEnum.addConstant("FOO_STRING", string);
    }

    @Test
    public void readTest()
    {
        extEnum.addConstant("FOO_NULL_STRING", new Foo(null));
        extEnum.addConstant("FOO_EMPTY_STRING", new Foo(""));
        extEnum.addConstant("FOO_STRING", string);
        Assert.assertEquals(extEnum.valueOf("FOO_NULL_STRING").getMessage(), null);
        Assert.assertEquals(extEnum.valueOf("FOO_EMPTY_STRING").getMessage(), "");
        Assert.assertEquals(extEnum.valueOf("FOO_STRING").getMessage(), "My String");
    }
}
