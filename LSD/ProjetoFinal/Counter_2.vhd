library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity Counter_2 is

	port(  clk   : in std_logic;
			 reset : in std_logic;
			 enable: in std_logic;
			 count : out std_logic_vector(7 downto 0));
			 
end Counter_2;

architecture Behavioral of Counter_2 is
	
	signal max : unsigned(7 downto 0):= "11111111";
	signal s_count : unsigned(7 downto 0):= "00000000";
	
begin
process(clk)
	begin
	   if (rising_edge(clk)) then
			if(reset = '0') then
				s_count<= (others => '0');
			else
				if (enable = '1') then
					if(s_count < unsigned(max)) then
						s_count <= s_count + 1;
					end if;
				end if;
			end if;
		end if;
			
end process;
	
	count <= std_logic_vector(s_count);

end Behavioral;