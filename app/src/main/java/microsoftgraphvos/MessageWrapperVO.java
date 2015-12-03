package microsoftgraphvos;

import com.google.gson.annotations.SerializedName;

public class MessageWrapperVO {

    @SerializedName("Message")
    public MessageVO message;

    public boolean saveToSentItems;
}
