# AutoMessage


Spigot plugin: https://www.spigotmc.org/resources/automessage.372/

Added support for TellRaw messages.
Example messages:
- '{"text":"[Get more info on TellRaws here: minecraft.tools/en/tellraw.php ]","color":"dark_purple"}'
- '{"text":"[This is a test message!] ","color":"aqua"}'
- '["",{"text":"Click me to open URL!","color":"red","bold":true,"underlined":false,"clickEvent":{"action":"open_url","value":"https://www.google.com"}}]'
- '{"text":"Hover over me for help text!","color":"yellow","bold":true,"hoverEvent":{"action":"show_text","value":{"text":"","extra":[{"text":"I
  am a hint!","color":"yellow","bold":true}]}}}'
- '{"text":"Click me to run help command!","color":"yellow","bold":true,"clickEvent":{"action":"run_command","value":"/help"}}'