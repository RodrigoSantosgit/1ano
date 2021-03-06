library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity Counter1sec is

	port ( clk : in std_logic;
			 reset : in std_logic;
			 enable : in std_logic;
			 count : out std_logic_vector(7 downto 0));

end Counter1sec;

architecture behav of Counter1sec is

	signal s_count : std_logic_vector(7 downto 0) := "00000000";
	signal clkDiviser : integer := 0;
	
	begin
	process(clk, reset, enable, clkDiviser, s_count)
	begin
	
	if(rising_edge(clk)) then
		if (reset = '1') then
			s_count <= "00000000";
			clkDiviser <= 0;
		elsif (enable = '1') then
			if (clkDiviser = 50000000) then
				s_count <= std_logic_vector(unsigned(s_count) + 1);
				clkDiviser <= 0;
			else
				clkDiviser <= clkDiviser + 1;
			end if;
		end if;
	end if;
	
	
	
	end process;
	
	count <= s_count;
	
end behav;		