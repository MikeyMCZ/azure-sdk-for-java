// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.translation.text;

import java.util.List;
import java.util.ArrayList;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.ai.translation.text.models.InputTextItem;
import com.azure.ai.translation.text.models.ProfanityAction;
import com.azure.ai.translation.text.models.ProfanityMarker;
import com.azure.ai.translation.text.models.TextType;
import com.azure.ai.translation.text.models.TranslatedTextItem;
import com.azure.ai.translation.text.models.TranslationText;
import com.azure.ai.translation.text.options.TranslateOptions;

/**
 * You can ask translation service to include alignment projection from source text to translated text.
 */
public class TranslateAlignments {
    /**
     * Main method to invoke this demo.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(final String[] args) {
        String apiKey = System.getenv("TEXT_TRANSLATOR_API_KEY");
        String region = System.getenv("TEXT_TRANSLATOR_API_REGION");
        AzureKeyCredential credential = new AzureKeyCredential(apiKey);

        TextTranslationClient client = new TextTranslationClientBuilder()
                .credential(credential)
                .region(region)
                .endpoint("https://api.cognitive.microsofttranslator.com")
                .buildClient();

        TranslateOptions translateOptions = new TranslateOptions()
            .setSourceLanguage("en")
            .addTargetLanguage("cs")
            .setIncludeAlignment(true);

        List<TranslatedTextItem> translations = client.translate("The answer lies in machine translation.", translateOptions);

        for (TranslatedTextItem translation : translations) {
            for (TranslationText textTranslation : translation.getTranslations()) {
                System.out.println("Text was translated to: '" + textTranslation.getTo() + "' and the result is: '" + textTranslation.getText() + "'.");
                System.out.println("Alignments: " + textTranslation.getAlignment().getProjections());
            }
        }
    }
}
