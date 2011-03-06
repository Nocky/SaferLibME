package org.bouncycastle.util.io.pem;

import java.util.Vector;



public class PemObject
    implements PemObjectGenerator
{
    private static final Vector EMPTY_LIST = new Vector ();
    //Collections.unmodifiableList(new ArrayList());

    private String type;
    private Vector   headers;
    private byte[] content;

    /**
     * Generic constructor for object without headers.
     *
     * @param type pem object type.
     * @param content the binary content of the object.
     */
    public PemObject(String type, byte[] content)
    {
        this(type, EMPTY_LIST, content);
    }

    /**
     * Generic constructor for object with headers.
     *
     * @param type pem object type.
     * @param headers a list of PemHeader objects.
     * @param content the binary content of the object.
     */
    public PemObject(String type, Vector headers, byte[] content)
    {
        this.type = type;
        this.headers = headers;
        this.content = content;
    }

    public String getType()
    {
        return type;
    }

    public Vector getHeaders()
    {
        return headers;
    }

    public byte[] getContent()
    {
        return content;
    }

    public PemObject generate()
        throws PemGenerationException
    {
        return this;
    }
}
