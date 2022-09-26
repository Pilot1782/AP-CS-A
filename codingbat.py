def uwuer(text):
    import requests
    url = "https://eoxuxds8ibri6o6.m.pipedream.net"
    body = {"text": str(text)}
    resp = requests.post(url, json=body)
    return resp.text


print(uwuer("Bingus Chillingington"))