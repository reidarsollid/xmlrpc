-module(message_server).
-export([handler/2]).

handler(_State, {call, message, [From, Message]}) ->
	io:fwrite("message: ~s from ~s ~n", [Message, From]),
	ReturnMessage = "Message received " ++ Message,
	{false, {response, [ReturnMessage]}};
handler(_State, Payload) ->
    FaultString = lists:flatten(io_lib:format("Unknown call: ~p", [Payload])),
    {false, {response, {fault, -1, FaultString}}}.

% erl -pa ../ebin -pa ../../xmerl/ebin
% {ok, Pid} = xmlrpc:start_link({message_server, handler}).
