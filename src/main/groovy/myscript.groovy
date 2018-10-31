import net.sf.json.JSONArray
import net.sf.json.JSONObject

JSONArray attachments = new JSONArray()
JSONObject attachment = new JSONObject()
attachment.put('text', "hello")
attachment.put('image_url', "https://gifs.b17.us/static/img/goin-for-me.gif")
attachment.put('fallback', "hey, vader seems to be mad at you")
attachment.put('color', '#ff0000')
attachments.add(attachment)

println attachments.toString()
