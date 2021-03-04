library IEEE;
use IEEE.std_logic_1164.all;
entity clock_pulse is
	port(
			inp : in std_logic;
			clk : in std_logic;
			reset : in std_logic;
			outp: out std_logic
			);
end clock_pulse;

architecture Behavioral of clock_pulse is
signal delay1, delay2, delay3 : std_logic;
begin
process(clk, reset)
begin
	if (reset= '1') then
		delay1<='0';
		delay2<='0';
		delay3<='0';
	elsif(rising_edge(clk)) then
		delay1<= inp;
		delay2<=delay1;
		delay3<=delay2;
	end if;
end process;
outp <= delay1 and delay2 and not delay3;
end Behavioral;