## Installation

Add maven dependency: _com.khipu:khipu-chaski-api-client:1.0.0_

## Usage

### Basic usage
```java
package test;

import com.khipu.chaski.api.client.PushNotificationsApi;
import com.khipu.chaski.api.model.SuccessResponse;
improt com.khipu.chaski.api.model.Message;
import com.khipu.ApiClient;
import com.khipu.ApiException;


public class Test {
    public static void main(String[] args) throws ApiException {
        ApiClient client = new ApiClient();
        client.setKhipuCredentials(1234L, "abcd123");
        PushNotificationsApi notificationsApi = new PushNotificationsApi();
        notificationsApi.setApiClient(client);
        Message message = new Message();
        message.getRecipientIdSet().add("recipient");
        message.setSubject("subject");
        message.setBody("Hello!!!");
        SuccessResponse respose = notificationsApi.sendMessage(message);
        System.out.println(respose.getMessage());
    }
}

```
