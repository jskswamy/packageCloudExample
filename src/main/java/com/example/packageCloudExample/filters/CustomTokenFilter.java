package com.example.packageCloudExample.filters;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;

import java.io.IOException;

public class CustomTokenFilter extends TokenFilter {

    protected CustomTokenFilter(TokenStream input) {
        super(input);
    }

    public final boolean incrementToken() throws IOException {
        return false;
    }
}
