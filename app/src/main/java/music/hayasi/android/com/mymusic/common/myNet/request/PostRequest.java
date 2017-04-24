package music.hayasi.android.com.mymusic.common.myNet.request;


import music.hayasi.android.com.mymusic.common.myNet.Uitls.NetUitl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PostRequest extends BaseRequest<PostRequest> {


    /**
     * * 构造函数，初始化
     *
     * @param url
     */
    public PostRequest(String url) {
        super(url);
    }

    @Override
    protected Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = NetUitl.appendHeaders();
        return requestBuilder.get().post(requestBody).url(mUrl).build();
    }

    @Override
    protected RequestBody generateRequestBody() {
        return null;
    }
}
