package music.hayasi.android.com.mymusic.common.net.request;

import music.hayasi.android.com.mymusic.common.net.utils.HttpUtils;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * ================================================
 * 作    者：廖子尧
 * 版    本：1.0
 * 创建日期：2016/1/16
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class HeadRequest extends BaseRequest<HeadRequest> {

    public HeadRequest(String url) {
        super(url);
    }

    @Override
    protected RequestBody generateRequestBody() {
        return null;
    }

    @Override
    protected Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = HttpUtils.appendHeaders(headers);
        url = HttpUtils.createUrlFromParams(baseUrl, params.urlParamsMap);
        return requestBuilder.head().url(url).tag(tag).build();
    }
}