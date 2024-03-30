package com.example.indent;

public class TextBlockFormatter {
    private final int CODE_TEXT_BLOCK_INDENT = 4;

    String formatLinesToCodeBlockIndent(String code) {
        // use CODE_TEXT_BLOCK_INDENT as padding value

        return code.indent(this.CODE_TEXT_BLOCK_INDENT);
    }
}
